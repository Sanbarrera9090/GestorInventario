package com.co.gestor.inventario.service;

import com.co.gestor.inventario.model.Producto;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class ProductServive {
    private static final String COLLECTION_NAME ="products" ;

    public String saveProduct(Producto producto) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();

        ApiFuture<WriteResult> collectionApiFuture = dbFirestore.collection(COLLECTION_NAME).document(producto.getNombre()).set(producto);

        return collectionApiFuture.get().getUpdateTime().toString();

    }
}
