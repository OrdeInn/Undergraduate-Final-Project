package com.thesis.Operational.Workflow.Management.and.Automation.System.payloads.request.items;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewProductRequest {

    private String name;

    private Long categoryId;

    private double price;
}