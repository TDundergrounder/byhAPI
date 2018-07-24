package com.beyondh.cases.hotel;

import com.beyondh.constants.TestConstants;
import com.beyondh.cases.AbstractTestCase;

import com.beyondh.dataprovider.HotelDataProvider;
import com.beyondh.dataprovider.OrderDataProvider;
import com.beyondh.model.PagedModel;
import com.beyondh.model.hotel.*;
import com.beyondh.model.order.OpenSmartDoorLockModel;
import com.beyondh.utility.ClientGroup;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

@Test(groups = (TestConstants.GRPOUP_HOTEL),singleThreaded=true)
@ClientGroup(TestConstants.GRPOUP_HOTEL)
public class HotelCases extends AbstractTestCase {

    @Test(dataProvider = HotelDataProvider.DATA_GETROOMTYPES,dataProviderClass = HotelDataProvider.class)
    private void getRoomTypesCase(RoomType expect)
    {
        RoomType[] result = _hotelInvoker.getRoomTypes();
        Assert.assertNotNull(result);
        Assert.assertTrue(result.length > 0);

        RoomType actual =  Arrays.stream(result).filter(x->x.getRoomTypeId().equals(expect.getRoomTypeId())).findFirst().orElse(null);
        Assert.assertNotNull(actual);
    }

    @Test(dataProvider = HotelDataProvider.DATA_GETHOTELROOMTYPES,dataProviderClass = HotelDataProvider.class)
    private void getHotelRoomTypesCase(long orgId,RoomTypeInfo expect)
    {
        RoomTypeInfo[] result = _hotelInvoker.getHotelRoomTypes(orgId);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.length > 0);

        RoomTypeInfo actual =  Arrays.stream(result).filter(x->x.getRoomTypeId().equals(expect.getRoomTypeId())).findFirst().orElse(null);
        Assert.assertNotNull(actual);
    }

    @Test(dataProvider = HotelDataProvider.DATA_GETHOTELS,dataProviderClass = HotelDataProvider.class)
    private void getHotelsCase(HotelQueryModel queryModel,HotelInfo expect)
    {
        PagedModel<HotelInfo> result = _hotelInvoker.getHotels(queryModel);
        HotelInfo[] hotels = result.getContent();
        Assert.assertTrue(hotels.length >0);

        HotelInfo actual =  Arrays.stream(hotels).filter(x->x.getOrgName().equals(expect.getOrgName())).findFirst().orElse(null);
        Assert.assertNotNull(actual);
        Assert.assertEquals(actual.getOrgName(), expect.getOrgName());
        Assert.assertEquals(actual.getOrgId(), expect.getOrgId());
    }

    @Test(dataProvider = HotelDataProvider.DATA_ADDROOMREMARK,dataProviderClass = HotelDataProvider.class)
    private void addRoomRemarkCase(AddRoomRemarkModel addRoomRemarkModel)
    {
        MyRoomRemarkQueryModel query = new MyRoomRemarkQueryModel(addRoomRemarkModel.getOrgId(),addRoomRemarkModel.getCheckinId(),addRoomRemarkModel.getMemberId());
        RoomRemarkInfo[] remarks =  _hotelInvoker.getMyRoomRemarks(query).getContent();
        if(remarks.length > 0)
        {
            Assert.assertTrue(true);
            return;
        }

        boolean result = _hotelInvoker.addRoomRemark(addRoomRemarkModel);
        Assert.assertTrue(result);

        remarks =  _hotelInvoker.getMyRoomRemarks(query).getContent();
        Assert.assertTrue(remarks.length >0);
        Assert.assertEquals(remarks[0].getCheckinId(),addRoomRemarkModel.getCheckinId());
        Assert.assertEquals(remarks[0].getCleanScore(),addRoomRemarkModel.getCleanScore());
        Assert.assertEquals(remarks[0].getFacilityScore(),addRoomRemarkModel.getFacilityScore());
        Assert.assertEquals(remarks[0].getLocationScore(),addRoomRemarkModel.getLocationScore());
        Assert.assertEquals(remarks[0].getServiceScore(),addRoomRemarkModel.getServiceScore());
        Assert.assertEquals(remarks[0].getRemark(),addRoomRemarkModel.getRemark());
    }

    @Test(dataProvider = HotelDataProvider.DATA_SEARCHHOTELWITHROOMPRICEANDROOMCOUNTCASE,dataProviderClass = HotelDataProvider.class)
    private void searchHotelWithRoomPriceAndRoomCountCase(HotelSearchModel query)
    {
        HotelSearchResultInfo[] result = _hotelInvoker.searchHotelWithRoomPriceAndRoomCount(query);
        Assert.assertTrue(result.length>0);
        Assert.assertTrue(result[0].getRoomCounts().length >0);
        Assert.assertTrue(result[0].getPrices().length >0);
    }

    @Test(dataProvider = HotelDataProvider.DATA_GETMEMBERHOURRENTPRICE,dataProviderClass = HotelDataProvider.class)
    private void getMemberHourRentPriceCase(HourRentMemberPriceQueryModel query, BigDecimal expect)
    {
        HourRentMemberPriceQueryResultInfo[] result = _hotelInvoker.getMemberHourRentPrice(query);
        Assert.assertTrue(result.length>0);

        Assert.assertTrue(Arrays.stream(result).allMatch(x-> Arrays.stream(x.getPrices()).allMatch(y->y.getActualPrice().setScale(0,RoundingMode.HALF_UP).equals(expect))));
    }

    @Test(dataProvider = HotelDataProvider.DATA_UPDATEHOTELWECHATLOCATION,dataProviderClass = HotelDataProvider.class)
    private void updateHotelWechatLocationCase(WechatLocationModel locationModel)
    {
        boolean result = _hotelInvoker.updateHotelWechatLocation(locationModel);
        Assert.assertTrue(result);
    }

    @Test(dataProvider = HotelDataProvider.DATA_GETFLOORS,dataProviderClass = HotelDataProvider.class)
    private void getFloors(long orgId)
    {
        FloorInfo[] result = _hotelInvoker.getFloors(orgId);
        Assert.assertTrue(result.length > 0);
    }

    @Test(dataProvider = HotelDataProvider.DATA_GETHOTELINFO,dataProviderClass = HotelDataProvider.class)
    private void getHotelInfoCase(long orgId,HotelInfo expect)
    {
        HotelInfo result = _hotelInvoker.getHotelInfo(orgId);
        Assert.assertNotNull(result);
        Assert.assertEquals(result.getOrgName(),expect.getOrgName());
        Assert.assertEquals(result.getOrgSn(),expect.getOrgSn());
    }

    @Test(dataProvider = HotelDataProvider.DATA_GETOWNERCONFIGS,dataProviderClass = HotelDataProvider.class)
    private void getOwnerConfigsCase(OwnerConfigQueryModel queryModel,OwnerConfigInfo expect)
    {
        OwnerConfigInfo[] result = _hotelInvoker.getOwnerConfigs(queryModel);
        Assert.assertTrue(result.length == 1);
        OwnerConfigInfo config = result[0];
        Assert.assertEquals(config.getValue(),expect.getValue());
        Assert.assertEquals(config.getKey(),expect.getKey());
        Assert.assertEquals(config.getCategory(),expect.getCategory());
        Assert.assertEquals(config.getDescription(),expect.getDescription());
    }

    @Test(dataProvider = HotelDataProvider.DATA_GETORGCONFIGS,dataProviderClass = HotelDataProvider.class)
    private void getOrgConfigsCase(OrgConfigQueryModel queryModel,OrgConfigInfo expect)
    {
        OrgConfigInfo[] result = _hotelInvoker.getOrgConfigs(queryModel);
        Assert.assertTrue(result.length == 1);
        OrgConfigInfo config = result[0];
        Assert.assertEquals(config.getValue(),expect.getValue());
        Assert.assertEquals(config.getKey(),expect.getKey());
        Assert.assertEquals(config.getCategory(),expect.getCategory());
        Assert.assertEquals(config.getDescription(),expect.getDescription());
    }

    @Test(dataProvider = HotelDataProvider.DATA_GETHTNETDOOROPENINFO,dataProviderClass = HotelDataProvider.class)
    private void GetHTNetDoorOpenInfoCase(HTNetDoorOpenQueryModel openQueryModel)
    {
        HTNetDoorOpenInfo result = _hotelInvoker.getHTNetDoorOpenInfo(openQueryModel);
        Assert.assertNotNull(result);
        Assert.assertFalse(result.getCanOpen());
    }

    @Test(dataProvider = HotelDataProvider.DATA_GETORGGOODS,dataProviderClass = HotelDataProvider.class)
    private void getOrgGoodsCase(long orgId, HotelGoodsInfo expectContained)
    {
        HotelGoodsInfo[] result = _hotelInvoker.getOrgGoods(orgId);
        Assert.assertTrue(result.length > 0);

        HotelGoodsInfo goodContained =  Arrays.stream(result).filter(x->x.getGoodsId().equals(expectContained.getGoodsId())).findFirst().orElse(null);
        Assert.assertNotNull(goodContained);
        Assert.assertEquals(goodContained.getGoodsName(),expectContained.getGoodsName());
        Assert.assertEquals(goodContained.getPrice(),expectContained.getPrice());
    }
}
