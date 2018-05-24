package ar.com.eduit.curso.java.archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Archivo implements I_Archivo {
    private File file; // objeto file importado del paquete io.file
    public Archivo(File file) {
        this.file = file;
    }
    public Archivo(String file){
        this.file = new File(file);
    }
    
    @Override
    public void print() {
        int car;
    //imprimir en consola el contenido del archivo
        try(FileReader in=new FileReader(file);) {
            //abre el archivo y lo lee
            //a partir de JDK 1.7 en el try puedo controlar el autocloseable
            //in.close(); -- no lo meto porque lo controlo desde el try()
            while((car=in.read())!=-1){
                System.out.print((char)car);
            }
        
        
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println();
    
    }

    @Override
    public String getText() {
        StringBuilder sb=new StringBuilder();
        int car;
    //imprimir en consola el contenido del archivo
        try(FileReader in=new FileReader(file);) {
            //abre el archivo y lo lee
            //a partir de JDK 1.7 en el try puedo controlar el autocloseable
            //in.close(); -- no lo meto porque lo controlo desde el try()
            while((car=in.read())!=-1){
                sb.append((char) car);
            }
        
        
        } catch (Exception e) {
            System.out.println(e);
        }
        return sb.toString();
    }

    @Override
    public void setText(String text) {
        try(FileWriter out=new FileWriter(file);) {
            out.write(text);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void appendText(String text) {
        try(FileWriter out=new FileWriter(file,true);) {
            out.write(text);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void addLine(String line) {
        //appendText(line+"\n");
        try(BufferedWriter out=new BufferedWriter(new FileWriter(file,true))) {
            out.write(line);
            out.newLine();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public List<String> getLines() {
        String linea;
        List<String>lista=new ArrayList();
        try(BufferedReader in=new BufferedReader(new FileReader(file));) {
           // lista.addAll((List<String>)in.lines()); //con Java 8
           while((linea=in.readLine())!=null){
               lista.add(linea);
           }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }

    @Override
    public Set<String> getLinkedHashLies() {
        Set<String> set = new LinkedHashSet();
        set.addAll(getLines());
        return set;
    }

    @Override
    public Set<String> getTreeLines() {
        Set<String> set = new TreeSet();
        set.addAll(getLines());
        return set;
    }

    @Override
    public void removeLine(String line) {
        List<String>lista=getLines();
        lista.remove(line);
        addLines(lista);
    }

    @Override
    public void addLines(Collection<String> lineas) {
        try(BufferedWriter out=new BufferedWriter(new FileWriter(file));) {
            for(String st::lineas) out.write(st+"\n");
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
