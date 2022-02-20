package com.example.tablelayouttest

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addRow(view: View) {
        val table = findViewById<TableLayout>(R.id.table)
        var textAndroidVersion = findViewById<EditText>(R.id.androidVersion)
        var textAndroidCode = findViewById<EditText>(R.id.androidCodeName)
        val row = TableRow(this)
        val lp = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        row.layoutParams = lp
        val textView1 = TextView(this)
        textView1.text = textAndroidVersion.text.toString()
        val textView2 = TextView(this)
        textView2.text = textAndroidCode.text.toString()
        row.addView(textView1)
        row.addView(textView2)
        table.addView(row, counter)
        counter++
    }
}