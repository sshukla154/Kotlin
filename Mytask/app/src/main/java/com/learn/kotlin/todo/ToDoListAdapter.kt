package com.learn.kotlin.todo

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.todo_row.view.*

class ToDoListAdapter(var todoList: List<String>) : RecyclerView.Adapter<ToDoListAdapter.TodoHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoHolder {
        return TodoHolder(LayoutInflater.from(parent.context).inflate(R.layout.todo_row, parent, false))
    }

    override fun getItemCount(): Int {
        return todoList.count()
    }

    override fun onBindViewHolder(holder: TodoHolder, position: Int) {
        var inputTodo = todoList[position]
        holder.bindToDo(inputTodo)
    }

    class TodoHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {

        var view : View = v;
        var title_ : String = "";

        init {
            v.setOnClickListener(this)
        }

        fun bindToDo(title: String) {
            this.title_ = title
            view.textView.text = title
        }
        override fun onClick(v: View?) {
            val intent = Intent(view.context, CompleteToDoActivity::class.java)
            intent.putExtra("title", title_)
            startActivity(view.context, intent, null)
        }
    }

}