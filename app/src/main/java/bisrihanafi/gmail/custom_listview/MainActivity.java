package bisrihanafi.gmail.custom_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //TODO 1 : Mendeklarasikan isi list  title dan sub title
    ListView list;
    String[]maintitle={"Title1","Title2","Title3","Title4","Title5",};
    String[]subtitle={"SubTitle1","SubTitle2","SubTitle3","SubTitle4","SubTitle5",};

    //TODO 2 : Mengambil gambar dari sumber daya drawable "meskipun gambarnya semua sama sih"
    Integer[]imgid={
            R.drawable.download_1,
            R.drawable.download_2,
            R.drawable.download_3,
            R.drawable.download_4,
            R.drawable.download_5,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 3 : Mendeklarasikan objek adapter dari klas MylistAdapter dengan disertai parameter maintitle,subtitle, dan imgid
        MyListAdapter adapter=new MyListAdapter(this,maintitle,subtitle,imgid);

        //TODO 4 : mengaitkan object list dengan komponen list pada layout
        list=(ListView)findViewById(R.id.list);

        //TODO 5 : meng-set adapter list dengan adapter
        list.setAdapter(adapter);

        //TODO 6 : membuat event agar item pada list dapat dipilih/diclick
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //TODO method ini merupana overide OnItemClickListener
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //TODO 7 : program akan menampilkan Toast sesuai dengan item yang dipilih, namun disini hanya sebatas text sderhana
                if(position==0){
                    //codespecifictofirstlistitem
                    Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                }else if(position==1){
                    //codespecificto2ndlistitem
                    Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
                }else if(position==2){
                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }else
                    if(position==3){
                        Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                    }else if(position==4){
                        Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
