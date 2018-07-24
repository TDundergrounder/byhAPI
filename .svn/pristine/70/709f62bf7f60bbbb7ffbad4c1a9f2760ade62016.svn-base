package com.beyondh.invoker;

import com.beyondh.client.APIResult;
import com.beyondh.constants.TestConstants;
import com.beyondh.constants.SpringConstants;
import com.beyondh.enums.APICode;
import com.beyondh.model.PagedModel;
import com.beyondh.model.hotel.*;
import com.google.gson.reflect.TypeToken;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(SpringConstants.SCOPE_SINGLETON)
public class HotelAPIInvoker extends AbstractAPIInvoker {

    public HotelAPIInvoker() {
        super(TestConstants.HOTLE_ROUTE);
    }

    public PagedModel<HotelInfo> getHotels(HotelQueryModel queryModel) {
        APIResult result = post("GetHotels", queryModel);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(new TypeToken<PagedModel<HotelInfo>>(){}.getType());

        return null;
    }

    public RoomTypeInfo[] getHotelRoomTypes(long orgId) {
        APIResult result = post("GetHotelRoomTypes", orgId);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(RoomTypeInfo[].class);

        return null;
    }

    public FloorInfo[]  getFloors(long orgId){
        APIResult result = post("GetFloors",orgId);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(FloorInfo[].class);

        return  null;
    }

    public HotelInfo getHotelInfo(long orgId) {
        APIResult result = post("GetHotelInfo", orgId);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(HotelInfo.class);

        return null;
    }

    public RoomType[] getRoomTypes() {

        APIResult result = post("GetRoomTypes", null);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(RoomType[].class);

        return null;
    }

    public HallInfo[] getHalls(long orgId) {
        APIResult result = post("GetHalls", orgId);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(HallInfo[].class);

        return null;
    }

    public boolean addRoomRemark(AddRoomRemarkModel newRemark) {
        APIResult result = post("AddRoomRemark", newRemark);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(boolean.class);

        return false;
    }

    public PagedModel<RoomRemarkInfo> getMyRoomRemarks(MyRoomRemarkQueryModel query) {
        APIResult result = post("GetMyRoomRemarks", query);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(new TypeToken<PagedModel<RoomRemarkInfo>>(){}.getType());

        return null;
    }

    public HotelSearchResultInfo[] searchHotelWithRoomPriceAndRoomCount(HotelSearchModel searchRequest) {
        APIResult result = post("SearchHotelWithRoomPriceAndRoomCount", searchRequest);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(HotelSearchResultInfo[].class);

        return null;
    }

    public RoomInfo[] getAvailableRooms(AvailableRoomQueryModel query)
    {
        APIResult result = post("GetAvailableRooms", query);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(RoomInfo[].class);

        return null;
    }

    public HourRentMemberPriceQueryResultInfo[] getMemberHourRentPrice(HourRentMemberPriceQueryModel query)
    {
        APIResult result = post("GetMemberHourRentPrice", query);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(HourRentMemberPriceQueryResultInfo[].class);

        return null;
    }

    public boolean updateHotelWechatLocation(WechatLocationModel locationModel) {
        APIResult result = post("UpdateHotelWechatLocation", locationModel);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(boolean.class);

        return false;
    }

    public OwnerConfigInfo[] getOwnerConfigs(OwnerConfigQueryModel query)
    {
        APIResult result = post("GetOwnerConfigs", query);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(OwnerConfigInfo[].class);

        return null;
    }

    public OrgConfigInfo[] getOrgConfigs(OrgConfigQueryModel query)
    {
        APIResult result = post("GetOrgConfigs", query);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(OrgConfigInfo[].class);

        return null;
    }

    public HTNetDoorOpenInfo getHTNetDoorOpenInfo(HTNetDoorOpenQueryModel netDoorOpenQueryModel)
    {
        APIResult result = post("GetHTNetDoorOpenInfo", netDoorOpenQueryModel);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(HTNetDoorOpenInfo.class);

        return null;
    }

    public HotelGoodsInfo[] getOrgGoods(long orgId)
    {
        APIResult result = post("GetOrgGoods", orgId);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(HotelGoodsInfo[].class);

        return null;
    }
}
