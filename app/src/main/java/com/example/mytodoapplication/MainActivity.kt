package com.example.mytodoapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1= findViewById(R.id.button1) as Button
        button1.setOnClickListener{
            Toast.makeText(this@MainActivity, "SAVED SUCCESSFULLY", Toast.LENGTH_SHORT).show()
            val button2= findViewById(R.id.button2) as Button
            button2.setOnClickListener{
                Toast.makeText(this@MainActivity, "SAVED SUCCESSFULLY", Toast.LENGTH_SHORT).show()
                val button3= findViewById(R.id.button3) as Button
                button3.setOnClickListener{
                    Toast.makeText(this@MainActivity, "SAVED SUCCESSFULLY", Toast.LENGTH_SHORT).show()
    button1.setOnClickListener{
     val editTextTextPersonName =  findViewById(R.id.editTextTextPersonName) as TextView
     val heading1:String= editTextTextPersonName.text.toString()
     val editTextTextPersonName2 =  findViewById(R.id.editTextTextPersonName2) as TextView
     val det1:String= editTextTextPersonName.text.toString()
     val name =  findViewById(R.id.name) as TextView
     val date1:String= name.text.toString()
        val userData = UserData( det1, date1)
        val ref:DatabaseReference= FirebaseDatabase.getInstance().getReference("${heading1}/")
        ref.setValue(userData)
            .addOnSuccessListener {
                Toast.makeText(this,"Task Saved",Toast.LENGTH_SHORT).show()
            }
            .addOnFailureListener(){
                Toast.makeText(this,"Task could not be Saved",Toast.LENGTH_SHORT).show()
            }
    }
                    button2.setOnClickListener{
                        val editTextTextPersonName4 =  findViewById(R.id.editTextTextPersonName4) as TextView
                        val heading2:String= editTextTextPersonName4.text.toString()
                        val editTextTextPersonName5 =  findViewById(R.id.editTextTextPersonName5) as TextView
                        val det2:String= editTextTextPersonName5.text.toString()
                        val editTextTextPersonName6 =  findViewById(R.id.editTextTextPersonName6) as TextView
                        val date2:String= editTextTextPersonName6.text.toString()
                        val userData2=UserData2( det2,date2)
                        val ref2:DatabaseReference=FirebaseDatabase.getInstance().getReference("${heading2}/")
                        ref2.setValue(userData2)
                            .addOnSuccessListener {
                            Toast.makeText(this,"Task Saved",Toast.LENGTH_SHORT).show()
                        }
                            .addOnFailureListener(){
                                Toast.makeText(this,"Task could not be Saved",Toast.LENGTH_SHORT).show()
                            }

                    }
                    button3.setOnClickListener{
                        val editTextTextPersonName7 =  findViewById(R.id.editTextTextPersonName7) as TextView
                        val heading3:String= editTextTextPersonName7.text.toString()
                        val editTextTextPersonName9 =  findViewById(R.id.editTextTextPersonName9) as TextView
                        val det3:String= editTextTextPersonName9.text.toString()
                        val editTextPersonName10 =  findViewById(R.id.editTextTextPersonName10) as TextView
                        val date3:String= editTextPersonName10.text.toString()
                        val userData3=UserData3( det3,date3)
                        val ref3:DatabaseReference=FirebaseDatabase.getInstance().getReference("${heading3}/")
                        ref3.setValue(userData3)
                            .addOnSuccessListener {
                                Toast.makeText(this,"Task Saved",Toast.LENGTH_SHORT).show()
                            }
                            .addOnFailureListener(){
                                Toast.makeText(this,"Task could not be Saved",Toast.LENGTH_SHORT).show()
                            }

                    }
                }
    }
                }
            }

        }

data class UserData(val det1:String, val date1:String)
{
   //constructor(): this( det1:" ", date1:" ")
}
data class UserData2(val det2:String, val date2: String)
{
   // constructor(): this(det2:" ",date2: " ")
}
data class UserData3(val det3:String, val date3:String)
{
    //constructor(): this(det3= String(),date3= String())
}