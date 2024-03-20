package com.example.mybatis1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class yaoping {
        private int drug_id;//药品id
        private String drug_name;//药品名称
        private double price;//价格
        private String dosage;//计量
        private String expiration_date;//生产日期
        private String manufacturer;
}
