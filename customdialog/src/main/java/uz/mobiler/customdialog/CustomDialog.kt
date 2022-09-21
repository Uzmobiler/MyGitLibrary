package uz.mobiler.customdialog

import android.content.Context
import androidx.appcompat.app.AlertDialog

object CustomDialog {

    fun createInfoDialog(context: Context, title: String, message: String) {
        val alertDialog = AlertDialog.Builder(context)
        alertDialog.setTitle(title)
        alertDialog.setMessage(message)
        alertDialog.show()
    }
}