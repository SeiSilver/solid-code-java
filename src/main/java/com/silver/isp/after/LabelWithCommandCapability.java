package com.silver.isp.after;

import java.util.List;

public interface LabelWithCommandCapability {
    void issueCommand(String id, List<String> commandArgs);
}
