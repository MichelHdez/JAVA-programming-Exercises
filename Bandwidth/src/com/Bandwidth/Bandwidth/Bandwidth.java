package com.Bandwidth.Bandwidth;

    public class Bandwidth {
        public int available = 0;
    
        public int getAvailable() {
            return available;
        }
    
        public Bandwidth(int quota) {
            this.available = quota;
        }
    
        public void addMore(int more) {
            available += more;
        }
    }
