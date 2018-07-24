package com.beyondh.cases;

import com.beyondh.client.APIClientsFactory;
import com.beyondh.invoker.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

@ContextConfiguration(locations = { "classpath:spring-test-config.xml" })
public abstract class AbstractTestCase extends AbstractTestNGSpringContextTests {
    @Autowired
    protected HotelAPIInvoker _hotelInvoker;

    @Autowired
    protected BillAPIInvoker _billInvoker;

    @Autowired
    protected CouponAPIInvoker _couponAPIInvoker;

    @Autowired
    protected OrderAPIInvoker _orderAPIInvoker;

    @Autowired
    protected APIClientsFactory _clientFactory;

    @Autowired
    protected MemberAPIInvoker _memberAPIInvoker;

    @Autowired
    protected MessageAPIInvoker _messageAPIInvoker;


    @Autowired
    protected CashingBillAPIInvoker _cashingBillAPIInvoker;

    @BeforeClass
    public void setTestContext(ITestContext context)
    {
        if(null == context.getAttribute(OrderAPIInvoker.class.getTypeName())) {
            context.setAttribute(OrderAPIInvoker.class.getTypeName(), _orderAPIInvoker);
        }

        if(null == context.getAttribute(HotelAPIInvoker.class.getTypeName())) {
            context.setAttribute(HotelAPIInvoker.class.getTypeName(), _hotelInvoker);
        }
    }


}
