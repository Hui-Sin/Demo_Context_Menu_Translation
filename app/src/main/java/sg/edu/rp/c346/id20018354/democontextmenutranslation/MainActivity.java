package sg.edu.rp.c346.id20018354.democontextmenutranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvTranslatedText;
    TextView tvTranslatedText2;

    String wordClicked="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTranslatedText=findViewById(R.id.textViewTranslatedText);
        tvTranslatedText2=findViewById(R.id.textViewTranslatedText2);
        registerForContextMenu(tvTranslatedText);
        registerForContextMenu(tvTranslatedText2);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        Log.v("Context","create context");
        menu.add(0,0,0,"English");
        menu.add(0,1,1,"Italian");
        menu.add(0,2,2,"French");
        menu.add(0,3,3,"Japanese");
        menu.add(0,4,4,"Korean");
        menu.add(0,5,5,"Chinese");
        if(v==tvTranslatedText){
            wordClicked="hello";
            Log.v("Context","top view selected");
        }
        else if(v==tvTranslatedText2){
            wordClicked="bye";
            Log.v("Context","bottom view selected");
        }
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(wordClicked.equalsIgnoreCase("hello")){
        if(item.getItemId()==0) { //check whether the selected menu item ID is 0
            //code for action
            tvTranslatedText.setText("Hello");
            return true; //menu item successfully handled
        }
        else if(item.getItemId()==1) { //check if the selected menu item ID is 1
            //code for action
            tvTranslatedText.setText("Ciao");
            return true;  //menu item successfully handled
        }
        else if(item.getItemId()==2) { //check if the selected menu item ID is 1
            //code for action
            tvTranslatedText.setText("Bonjour");
            return true;  //menu item successfully handled
        }
        else if(item.getItemId()==3) { //check if the selected menu item ID is 1
            //code for action
            tvTranslatedText.setText("こんにちは");
            return true;  //menu item successfully handled
        }
        else if(item.getItemId()==4) { //check if the selected menu item ID is 1
            //code for action
            tvTranslatedText.setText("안녕하세요");
            return true;  //menu item successfully handled
        }
        else if(item.getItemId()==5) { //check if the selected menu item ID is 1
            //code for action
            tvTranslatedText.setText("你好");
            return true;  //menu item successfully handled
        }
    }
        else if(wordClicked.equalsIgnoreCase("bye")){
            if(item.getItemId()==0) { //check whether the selected menu item ID is 0
                //code for action
                tvTranslatedText2.setText("Bye");
                return true; //menu item successfully handled
            }
            else if(item.getItemId()==1) { //check if the selected menu item ID is 1
                //code for action
                tvTranslatedText2.setText("addio");
                return true;  //menu item successfully handled
            }
            else if(item.getItemId()==2) { //check if the selected menu item ID is 1
                //code for action
                tvTranslatedText2.setText("au revoir");
                return true;  //menu item successfully handled
            }
            else if(item.getItemId()==3) { //check if the selected menu item ID is 1
                //code for action
                tvTranslatedText2.setText("さようなら");
                return true;  //menu item successfully handled
            }
            else if(item.getItemId()==4) { //check if the selected menu item ID is 1
                //code for action
                tvTranslatedText2.setText("안녕");
                return true;  //menu item successfully handled
            }
            else if(item.getItemId()==5) { //check if the selected menu item ID is 1
                //code for action
                tvTranslatedText2.setText("再见");
                return true;  //menu item successfully handled
            }
        }
        return super.onContextItemSelected(item); //pass menu item to the superclass implementation
    }
}