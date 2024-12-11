/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.azrial.hotelreservationgui;

/**
 *
 * @author Azrial
 */
public class UserSession {
    private static int userId;
    private static String name;
    private static String role; 
    private static String email;
    private static String phoneNumber;
    private static String nik;

    // Getter dan Setter
    public static int getUserId() {
        return userId;
    }

    public static void setUserId(int userId) {
        UserSession.userId = userId;
    }

    public static String getRole() {
        return role;
    }

    public static void setRole(String role) {
        UserSession.role = role;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        UserSession.name = name;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        UserSession.email = email;
    }

    public static String getPhoneNumber() {
        return phoneNumber;
    }

    public static void setPhoneNumber(String phoneNumber) {
        UserSession.phoneNumber = phoneNumber;
    }

    public static String getNik() {
        return nik;
    }

    public static void setNik(String nik) {
        UserSession.nik = nik;
    }

    public static void clearSession() {
        userId = 0;
        role = null;
        name = null;
        email = null;
        phoneNumber = null;
        nik = null;
    }
}
