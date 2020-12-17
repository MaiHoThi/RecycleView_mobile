package com.example.login;

public class Product {
        private String name;
        // Image name (Without extension)
        private int price;
        private String hinhanh;

        public Product(String name, int price, String hinhanh) {
            this.price= price;
            this.name= name;
            this.hinhanh=hinhanh;
        }



        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
        public String getHinhanh() {
            return hinhanh;
        }

        public void setHinhanh(String hinhanh) {
            this.hinhanh = hinhanh;
        }

        @Override
        public String toString()  {
            return this.name+ this.price+ this.hinhanh;
        }
    }

