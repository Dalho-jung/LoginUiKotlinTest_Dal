package com.n2isys.loginuikotlintest_dal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.n2isys.loginuikotlintest_dal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var viewBind = ActivityMainBinding.inflate(layoutInflater,null,false)

        setContentView(viewBind.root)
        
    }
}