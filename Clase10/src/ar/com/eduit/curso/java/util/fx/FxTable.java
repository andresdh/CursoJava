package ar.com.eduit.curso.java.util.fx;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FxTable <E> { //"E" es lo que diga el user
    
    public void removeCol(TableView tv, int index){
        tv.getColumns().remove(index);
    }

    public void cargar(List<E> lista, TableView tv) {
        if(tv== null)return;
        tv.getColumns().clear();
        tv.getItems().clear();
        if(lista==null || lista.isEmpty()) return;
        E e = lista.get(0);
        Field[] campos = e.getClass().getDeclaredFields();
        //int cantidad = campos.length;
        //TableColumn col;
        //String nombreCol;
        Arrays.asList(campos).forEach (f -> {
            String nombreCol = f.getName();
            TableColumn col = new TableColumn(nombreCol);
            tv.getColumns().add(col);
            col.setCellValueFactory(new PropertyValueFactory<>(nombreCol));
        });
        tv.getItems().addAll(lista);
    }
}
