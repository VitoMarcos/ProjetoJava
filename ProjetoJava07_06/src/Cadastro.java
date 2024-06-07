import java.util.ArrayList;

public abstract class Cadastro {
    
private static ArrayList<Materiais> listaMateriais = new ArrayList<>();

public static void cadastrar(Materiais m){
listaMateriais.add(m);
System.out.println("Adicionado com sucesso!");
}

public static ArrayList<Materiais> getListaMateriais() {
    return listaMateriais;
}

public static Materiais buscar(String material) throws Exception{

    for (Materiais tempM : listaMateriais) {
        if (tempM.getMaterial().contains(material)) {
            return tempM;
        }
    }
    throw new Exception("\nMaterial em falta...");

}

public static void excluir(Materiais m){
    listaMateriais.remove(m);
}

public static void verificarListaVazia() throws Exception {

    if (listaMateriais.isEmpty()) {
        throw new Exception("\nATENÇÃO: Não há materiais cadastrados!");
}

}
}