package com.lambton;

public class Arithmetic
{
    	int add(int a, int b)
        {
            return  a + b;
        }

        float add(float a, float b)
        {
            return  a + b;
        }

        String add(String a, String b)
        {
            return  a + b;
        }

        String add(String a, int b)
        {
            return  a + b;
        }

        String add(int a, String b)
        {
            return  a + b;
        }

        int add(int a, int b , int c)
        {
            return  a + add(b, c);
        }

        float add(int a, int b, float c)
        {
            return  (float)add(a, b) + c;
        }

        float add(float a, int b)
        {
            return a + b;
        }

        float add(float a, int b, int c)
        {
            return a + (float)add(b,c);
        }

        String add(String a, int b, float c)
        {
            return a + add(b, c);
        }

        double add(int a, double b)
        {
            return  a + b;
        }

        float add(int a, float b)
        {
            return  a + b;
        }
}
