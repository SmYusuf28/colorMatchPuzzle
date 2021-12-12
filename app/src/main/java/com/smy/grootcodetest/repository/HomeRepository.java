package com.smy.grootcodetest.repository;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class HomeRepository {
   private FirebaseDatabase db = FirebaseDatabase.getInstance();
   private DatabaseReference root = db.getReference();


}
