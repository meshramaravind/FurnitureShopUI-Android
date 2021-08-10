package com.arvind.furnitureshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.arvind.furnitureshop.app.FurnitureShopApp
import com.arvind.furnitureshop.navigation.Navigation
import com.arvind.furnitureshop.ui.theme.FurnitureShopTheme
import dagger.hilt.android.AndroidEntryPoint

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FurnitureShopAppUiMain()
        }
    }

    @Composable
    fun FurnitureShopAppUiMain() {
        FurnitureShopTheme {
            Surface(color = MaterialTheme.colors.background) {
                Navigation()
            }
        }
    }
}
