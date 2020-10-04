package com.gocardless.services;
// again and again and gain
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gocardless.http.*;
import com.gocardless.resources.Mandate;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

/*
Added more
*/

/**
 * Service class for working with mandate resources.
 *
 * Mandates represent the Direct Debit mandate with a [customer](#core-endpoints-customers).
 * 
 * GoCardless will notify you via a [webhook](#appendix-webhooks) whenever the status of a mandate
 * changes. 
 */ 
public class customer {
    private final HttpClient httpClient;
    private final HttpClient firstName;
    private String address;

}