package com.learn.kotlin.todo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_complete_to_do.*

class CompleteToDoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complete_to_do)

        val todo = intent.extras?.getString("title")
        toDoTextView.text = todo

        completeButton.setOnClickListener {
            var preferences = getSharedPreferences(getString(R.string.SHARED_PREFERENCE_PATH), Context.MODE_PRIVATE)
            var todos = preferences.getStringSet(getString(R.string.TODO_STRINGS), setOf())?.toMutableSet()

            if (todos != null) {
                todos.remove(todo)
            }
            preferences.edit().putStringSet(getString(R.string.TODO_STRINGS), todos).apply()
            finish()
        }
    }
}