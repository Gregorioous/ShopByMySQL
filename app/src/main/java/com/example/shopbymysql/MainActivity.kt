package com.example.shopbymysql

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.shopbymysql.category.CatalogCategories
import com.example.shopbymysql.databinding.ActivityMainBinding
import com.example.shopbymysql.product.CatalogProducts

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        supportFragmentManager.beginTransaction().replace(R.id.mycontent, Panel()).commit()

        binding?.bottomNav?.setOnItemSelectedListener { item ->

            when(item.itemId) {
                R.id.panelItemBottomNav -> supportFragmentManager.beginTransaction().replace(R.id.mycontent, Panel()).commit()
                R.id.catalogProductsItemBottomNav -> supportFragmentManager.beginTransaction().replace(R.id.mycontent, CatalogProducts()).commit()
                R.id.catalogClothesItemBottomNav -> supportFragmentManager.beginTransaction().replace(R.id.mycontent, CatalogClothes()).commit()
                R.id.catalogCategoriesItemBottomNav -> supportFragmentManager.beginTransaction().replace(R.id.mycontent, CatalogCategories()).commit()
            }

            return@setOnItemSelectedListener true
        }

        binding?.bottomNav?.selectedItemId = R.id.panelItemBottomNav
    }
}