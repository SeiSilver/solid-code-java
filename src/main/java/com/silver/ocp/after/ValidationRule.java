package com.silver.ocp.after;

public interface ValidationRule {
    ValidationResult check(FlightPlan fp);
}
