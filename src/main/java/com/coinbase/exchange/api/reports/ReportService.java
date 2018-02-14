package com.coinbase.exchange.api.reports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;

import com.coinbase.exchange.api.exchange.GdaxExchange;

/**
 * Created by robevansuk on 16/02/2017.
 */
@Component
public class ReportService {

    public static final String REPORTS_ENDPOINT = "/reports";

    @Autowired
    GdaxExchange gdaxExchange;

    // TODO untested
    public ReportResponse createReport(String type, String startDate, String endDate){
        ReportRequest reportRequest = new ReportRequest(type, startDate, endDate);
        return gdaxExchange.post(REPORTS_ENDPOINT, new ParameterizedTypeReference<ReportResponse>(){}, reportRequest);
    }

    // TODO untested
    public ReportResponse getReportStatus(String id) {
        return gdaxExchange.get(REPORTS_ENDPOINT + "/" + id, new ParameterizedTypeReference<ReportResponse>(){});
    }
}
