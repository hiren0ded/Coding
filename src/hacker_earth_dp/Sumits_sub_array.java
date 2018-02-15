/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacker_earth_dp;

import java.util.Scanner;

/**
 *
 * @author HIREN
 */
public class Sumits_sub_array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            solver(arr,sc);
        }
        
    }
    
    public static void solver(int[] a,Scanner sc)
    {
        a[0]=sc.nextInt();
         long max_so_far = a[0];
         long curr_max = a[0];
         boolean all_negative=true;
         int min=Integer.MIN_VALUE;
         int size=a.length;
         long sum=0;
         if(a[0]>=0)
             sum=a[0];
        for (int i = 1; i < size; i++)
        {
            a[i]=sc.nextInt();
           curr_max = Math.max(a[i], curr_max+a[i]);
           max_so_far = Math.max(max_so_far, curr_max);
          // System.out.println(curr_max+" "+max_so_far);
           min=Math.max(min,a[i]);
           if(a[i]>=0)
           {
               all_negative=false;
               sum=sum+a[i];
           }
           
        }
        min=Math.max(min,a[0]);
        long ans2;
        if(all_negative)
            ans2=min;
        else
            ans2=sum;
        System.out.println(max_so_far+" "+ans2);
        
    }
    
    }
    

