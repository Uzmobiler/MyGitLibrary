package uz.mobiler.mygitlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.mobiler.customdialog.CustomDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CustomDialog.createInfoDialog(this, "Sanjar", "Suvonov")
    }
}