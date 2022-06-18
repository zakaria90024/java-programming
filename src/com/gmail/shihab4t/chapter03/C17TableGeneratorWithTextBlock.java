package com.gmail.shihab4t.chapter03;

public class C17TableGeneratorWithTextBlock {
    public static void main(String[] args) {
        String table = """
                           MasterDevSkills (PVT) LTD
                        403, Church St, Toronto, ON, CA.
                                CUSTOMER INVOICE
                +-----------------------+-----------------------+
                |INFO                   |CUSTOMER               |
                +-----------------------+-----------------------+
                |DATE: 2020-10-20       |XZY Distributors       |
                |TIME: 10:53:AM         |MOB: +1 317-468-0173   |
                |BILL NO: 12            |Address: No 25, Main St|
                |INVOICE NO: 458-80-108 |reet, ON, CA           |
                +-----------------------+-----------------------+
                |                SELLING DETAILS                |
                +-----------------+---------+-----+-------------+
                |ITEM             | PRICE($)|  QTY|        VALUE|
                +-----------------+---------+-----+-------------+
                |Optical mouse    |   120.00|   20|      2400.00|
                |Gaming keyboard  |   550.00|   30|     16500.00|
                +-----------------+---------+-----+-------------+
                                             GROSS     18,900.00
                                      DISCOUNT(5%)        945.00
                                            PAYABLE    17,955.60
                """;
        System.out.println(table);
    }
}
