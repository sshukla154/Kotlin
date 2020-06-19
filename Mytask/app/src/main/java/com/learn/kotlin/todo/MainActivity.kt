package com.learn.kotlin.todo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var layout_Manager : LinearLayoutManager
    private lateinit var todoListAdapter : ToDoListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            val createToDoIntent = Intent(view.context, CreateToDoActivity::class.java)
            startActivity(createToDoIntent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        /*

        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_delete_all -> true
            else -> super.onOptionsItemSelected(item)
        }
        */
        if(item.itemId == R.id.action_delete_all){
            var preferences = getSharedPreferences(getString(R.string.SHARED_PREFERENCE_PATH), Context.MODE_PRIVATE)
            preferences.edit().putStringSet(getString(R.string.TODO_STRINGS), null).apply()
            updateRecycler()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onResume() {
        super.onResume()
        updateRecycler()

    }

    fun updateRecycler(){
        var preferences = getSharedPreferences(getString(R.string.SHARED_PREFERENCE_PATH), Context.MODE_PRIVATE)
        var todoList = preferences.getStringSet(getString(R.string.TODO_STRINGS), setOf())?.toMutableSet()
        println(todoList)

        //Layout Manager
        layout_Manager = LinearLayoutManager(this)
        recyclerView.layoutManager = layout_Manager

        //Adapter
        if (todoList != null) {
            todoListAdapter = ToDoListAdapter(todoList.toList())
        }
        recyclerView.adapter = todoListAdapter
    }
}