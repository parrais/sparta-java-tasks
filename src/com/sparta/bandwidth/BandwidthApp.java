package com.sparta.bandwidth;

public class BandwidthApp {
    public static void main(String[] args) {
        final int MAX_BANDWIDTH_MBPS = 1000;
        final int USERS = 200;
        final int APP_A_BANDWIDTH = 200000;
        final int APP_B_BANDWIDTH = 100000;
        final int NEW_APP_BANDWIDTH = 350000;

        int networkCapacity = MAX_BANDWIDTH_MBPS * 1000000;
        int currentUsage = (APP_A_BANDWIDTH + APP_B_BANDWIDTH) * USERS;
        int currentAvailability = networkCapacity - currentUsage;
        int newUsage = NEW_APP_BANDWIDTH * USERS;
        int newAvailability = currentAvailability - newUsage;
        double newBandwidthMbps = (double) newAvailability / 1000000;

        System.out.printf("The network capacity in bps: %,d%n" +
                "The current usage in bps: %,d%n" +
                "The current availability in bps: %,d%n" +
                "The new applications requirements in bps: %,d%n" +
                "The bandwidth available if the new application is installed (in Mbps): %,.1f%n",
                networkCapacity, currentUsage, currentAvailability, newUsage, newBandwidthMbps);
    }
}
