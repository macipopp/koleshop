package com.kolshop.kolshopmaterial.common.util;

import android.content.Context;

import com.kolshop.kolshopmaterial.model.realm.Product;

import io.realm.Realm;

/**
 * Created by Gundeep on 25/07/15.
 */
public class RealmUtils {

    public static boolean saveProduct(Context context, Product product)
    {
        Realm realm = Realm.getInstance(context);
        //RealmQuery - create realm query to save product
        return true;
    }

}
