package com.promineotech.jeep.controller.support;

public class CreateOrderTestSupport extends BaseTest {


  protected String createOrderBody() {
    // @formatter: off
    return "{\n" 
        + "  \"customer\":\"ATTAWAY_HEKTOR\", \n" 
        + "  \"model\":\"WRANGLER\", \n"
        + "  \"trim\":\"SPORT ALTITUDE\", \n" 
        + "  \"doors\":4,\n"
        + "  \"color\":\"EXT_GRANITE_CRYSTAL\", \n"
        + "  \"engine\":\"2_0_TURBO\", \n" 
        + "  \"tire\":\"LT285_GOODYEAR\", \n"
        + "  \"options\":[ \n" 
        + "    \"DOOR_QUAD_4\", \n" 
        + "    \"EXT_MOPAR_STEP_CHROME\", \n"
        + "    \"INT_MOPAR_HEAD\", \n" 
        + "    \"STOR_RIDGE_CARGO\" \n" 
        + "  ] \n" 
        + "}";


    // @formatter: on
  }

}
