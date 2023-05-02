

package com.nurgul;

import com.nurgul.utility.HibernateUtility;


public class Yarisma {

    public static void main(String[] args) {
       HibernateUtility.getSessionFactory().openSession();
    }
}
