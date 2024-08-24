package com.example.quiz

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.Ques1.setOnClickListener {
                val option = arrayOf("a.Mumbai","b.Kolkata","c.New Delhi","d.Chennai")
                val builder1 = AlertDialog.Builder(this)
                builder1.setTitle("1.What is the capital of India?")
                builder1.setSingleChoiceItems(option,0,
                    DialogInterface.OnClickListener { dialogInterface, i ->

                    // whats action should be performed when user click any item

                })
                builder1.setPositiveButton("Submit",
                    DialogInterface.OnClickListener { dialogInterface, i ->

                    // What action should be performed when Yes is Clicked?
                    Toast.makeText(this,"Answer:New Delhi", Toast.LENGTH_SHORT).show()
                })
                builder1.setNegativeButton("Decline",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                    // What action should be performed when Yes is Clicked?
                    Toast.makeText(this,"Declined", Toast.LENGTH_SHORT).show()

                })
                builder1.show()

            }
        binding.Ques2.setOnClickListener {
            val option = arrayOf("a) Mahatma Gandhi",
            "b) Sardar Vallabhbhai Patel",
            "c) Bhagat Singh",
            "d) Subhas Chandra Bose")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("2.Who is known as the Iron Man of India?")
            builder2.setSingleChoiceItems(option,0,DialogInterface.OnClickListener { dialogInterface, i ->


            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this," Answer: Sardar Vallabhbhai Patel",Toast.LENGTH_SHORT).show()
            })
            builder2.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->
                //
                Toast.makeText(this,"Declined", Toast.LENGTH_SHORT).show()
            })
            builder2.show()
        }

        binding.Ques3.setOnClickListener {
            val option = arrayOf("a.Indira Gandhi", "b.Jawaharlal Nehru", "c.Rajendra Prasad", "d.Lal Bahadur Shastri")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("3.Who was the first Prime Minister of India?")
            builder2.setSingleChoiceItems(option,0,DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"Answer:Jawaharlal Nehru",Toast.LENGTH_SHORT).show()
            })
            builder2.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->
                //
                Toast.makeText(this,"Declined", Toast.LENGTH_SHORT).show()
            })
            builder2.show()
        }
        binding.Ques4.setOnClickListener {
            val option = arrayOf("a.Bankim Chandra Chattopadhyay", "b.Rabindranath Tagore", "c.Allama Iqbal", "d.Subramania Bharati")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("4.Who composed the Indian national anthem, 'Jana Gana Mana? ' ")
            builder2.setSingleChoiceItems(option,0,DialogInterface.OnClickListener { dialogInterface, i ->


            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"Answer:Rabindranath Tagore",Toast.LENGTH_SHORT).show()
            })
            builder2.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->
                //
                Toast.makeText(this,"Declined", Toast.LENGTH_SHORT).show()
            })
            builder2.show()
        }
        binding.Ques5.setOnClickListener {
            val option = arrayOf("a.Indira Gandhi", "b.Sarojini Naidu", "c.Pratibha Patil", "d.Meira Kumar")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("5.Who was the first woman to become the President of India?")
            builder2.setSingleChoiceItems(option,0,DialogInterface.OnClickListener { dialogInterface, i ->


            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"Answer:Pratibha Patil",Toast.LENGTH_SHORT).show()
            })
            builder2.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->
                //
                Toast.makeText(this,"Declined", Toast.LENGTH_SHORT).show()
            })
            builder2.show()
        }

    }
}