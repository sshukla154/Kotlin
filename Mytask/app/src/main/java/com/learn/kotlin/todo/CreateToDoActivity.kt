package com.learn.kotlin.todo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_create_to_do.*

class CreateToDoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_to_do)

        saveButton.setOnClickListener {
            var title = titleEditText.text.toString()
            if(importantCheckBox.isChecked) {
                title = "❗ " + titleEditText.text.toString()
            }

            var preferences = getSharedPreferences(getString(R.string.SHARED_PREFERENCE_PATH), Context.MODE_PRIVATE)
            var todos = preferences.getStringSet(getString(R.string.TODO_STRINGS), setOf())?.toMutableSet()
            todos?.add(title)
            preferences.edit().putStringSet("todoStrings", todos).apply()
            finish()
        }


    }
}