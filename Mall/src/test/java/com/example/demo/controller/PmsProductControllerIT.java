package com.example.demo.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class PmsProductControllerIT {
	@Autowired
	private MockMvc mockMvc;

	@Mock
	private PmsProductController pmsProductController;

	@Test
	void testCreate() {
		String param = "" + "{" + "  \"albumPics\": \"string\"," + "  \"brandId\": 0," + "  \"brandName\": \"string\","
				+ "  \"deleteStatus\": 0," + "  \"description\": \"string\"," + "  \"detailDesc\": \"string\","
				+ "  \"detailHtml\": \"string\"," + "  \"detailMobileHtml\": \"string\","
				+ "  \"detailTitle\": \"string\"," + "  \"feightTemplateId\": 0," + "  \"giftGrowth\": 0,"
				+ "  \"giftPoint\": 0," + "  \"id\": 0," + "  \"keywords\": \"string\"," + "  \"lowStock\": 0,"
				+ "  \"memberPriceList\": [" + "    {" + "      \"id\": 0," + "      \"memberLevelId\": 0,"
				+ "      \"memberLevelName\": \"string\"," + "      \"memberPrice\": 0," + "      \"productId\": 0"
				+ "    }" + "  ]," + "  \"name\": \"string\"," + "  \"newStatus\": 0," + "  \"note\": \"string\","
				+ "  \"originalPrice\": 0," + "  \"pic\": \"string\"," + "  \"prefrenceAreaProductRelationList\": ["
				+ "    {" + "      \"id\": 0," + "      \"prefrenceAreaId\": 0," + "      \"productId\": 0" + "    }"
				+ "  ]," + "  \"previewStatus\": 0," + "  \"price\": 0," + "  \"productAttributeCategoryId\": 0,"
				+ "  \"productAttributeValueList\": [" + "    {" + "      \"id\": 0,"
				+ "      \"productAttributeId\": 0," + "      \"productId\": 0," + "      \"value\": \"string\""
				+ "    }" + "  ]," + "  \"productCategoryId\": 0," + "  \"productCategoryName\": \"string\","
				+ "  \"productFullReductionList\": [" + "    {" + "      \"fullPrice\": 0," + "      \"id\": 0,"
				+ "      \"productId\": 0," + "      \"reducePrice\": 0" + "    }" + "  ],"
				+ "  \"productLadderList\": [" + "    {" + "      \"count\": 0," + "      \"discount\": 0,"
				+ "      \"id\": 0," + "      \"price\": 0," + "      \"productId\": 0" + "    }" + "  ],"
				+ "  \"productSn\": \"string\"," + "  \"promotionEndTime\": \"2022-06-05T13:16:08.699Z\","
				+ "  \"promotionPerLimit\": 0," + "  \"promotionPrice\": 0,"
				+ "  \"promotionStartTime\": \"2022-06-05T13:16:08.699Z\"," + "  \"promotionType\": 0,"
				+ "  \"publishStatus\": 0," + "  \"recommandStatus\": 0," + "  \"sale\": 0,"
				+ "  \"serviceIds\": \"string\"," + "  \"skuStockList\": [" + "    {" + "      \"id\": 0,"
				+ "      \"lockStock\": 0," + "      \"lowStock\": 0," + "      \"pic\": \"string\","
				+ "      \"price\": 0," + "      \"productId\": 0," + "      \"promotionPrice\": 0,"
				+ "      \"sale\": 0," + "      \"skuCode\": \"string\"," + "      \"spData\": \"string\","
				+ "      \"stock\": 0" + "    }" + "  ]," + "  \"sort\": 0," + "  \"stock\": 0,"
				+ "  \"subTitle\": \"string\"," + "  \"subjectProductRelationList\": [" + "    {" + "      \"id\": 0,"
				+ "      \"productId\": 0," + "      \"subjectId\": 0" + "    }" + "  ]," + "  \"unit\": \"string\","
				+ "  \"usePointLimit\": 0," + "  \"verifyStatus\": 0," + "  \"weight\": 0" + "}";
		try {
			RequestBuilder request = MockMvcRequestBuilders//
					.post("/product/create").accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON)
					.content(param).accept(MediaType.APPLICATION_JSON);

			mockMvc.perform(request)//
					.andExpect(jsonPath("$.code", is(200)))
					.andExpect(jsonPath("$.message", is("????????????"))).andDo(print()).andReturn();
		} catch (Exception e) {
			e.printStackTrace();
			fail("???????????????");
		}
	}

	@Test
	void testList() {
		String param = "{\r\n"
				+ "    \"brandId\": 0,\r\n"
				+ "    \"keyword\": \"string\",\r\n"
				+ "    \"pageNum\": 0,\r\n"
				+ "    \"pageSize\": 0,\r\n"
				+ "    \"productCategoryId\": 0,\r\n"
				+ "    \"productSn\": \"string\",\r\n"
				+ "    \"publishStatus\": 0,\r\n"
				+ "    \"verifyStatus\": 0\r\n"
				+ "}";
		try {
			RequestBuilder request = MockMvcRequestBuilders//
					.get("/product/list").accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON)
					.content(param).accept(MediaType.APPLICATION_JSON);

			mockMvc.perform(request)//
					.andExpect(jsonPath("$.code", is(200))).andExpect(jsonPath("$.message", is("????????????"))).andDo(print())
					.andReturn();
		} catch (Exception e) {
			e.printStackTrace();
			fail("???????????????");
		}
	}

}
