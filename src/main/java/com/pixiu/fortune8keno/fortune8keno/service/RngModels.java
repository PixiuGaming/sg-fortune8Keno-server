package com.pixiu.fortune8keno.fortune8keno.service;

import java.util.List;
/**
 * Wire models for POST https://{domain}/irgs/rng
 *
 * Request:  { "upperBounds": [10, 30] }
 * Response: { "randomNumbers": [3, 20] }   -- each value is in [0, upperBound)
 */
public class RngModels
{

    public record RngRequest(List<Long> upperBounds) {
    }

    public record RngResponse(List<Integer> randomNumbers) {
    }

    public record RngErrorResponse(String error) {
    }
}
