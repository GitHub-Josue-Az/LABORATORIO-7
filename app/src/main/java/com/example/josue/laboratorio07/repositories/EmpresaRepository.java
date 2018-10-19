package com.example.josue.laboratorio07.repositories;
import com.example.josue.laboratorio07.R;
import com.example.josue.laboratorio07.models.Empresa;

import java.util.ArrayList;
import java.util.List;

public class EmpresaRepository {
    private static EmpresaRepository _INSTANCE = null;

    private EmpresaRepository(){}

    public static EmpresaRepository getInstance(){
        if (_INSTANCE == null)
            _INSTANCE = new EmpresaRepository();
        return _INSTANCE;
    }

    private List<Empresa> empresas = new ArrayList<>();

    public List<Empresa> getEmpresas() {
        empresas.add(new Empresa(1,"Restaurante","Forkroad","Mz.I Lt 1 Gr Sc.2 Ventanilla - Lima - Lima",
                "(01) 288 0524", "forkroad@gmail.com", "www.forkroad.com", R.drawable.casa, "La mejor comida"));

        empresas.add(new Empresa(2,"Restaurante","Sabor y Sazón","Mz.L Lt 27 Pachacutec 1º Etapa - Giron Camana",
                "(01) 293 3868", "saborysazon@gmail.com", "www.saborysazon.com", R.drawable.sabor, "Sazón"));

        empresas.add(new Empresa(3,"Banco","Banco BCP","Av. Peru s/n, Plz. Barrios Altos-Riva Aguero",
                "(01) 2879546", "bancobcp@gmail.com", "www.bancobcp.com", R.drawable.bcp, "Tu banco de confianza"));

        empresas.add(new Empresa(4,"Banco","Azteca","San Juan de Lurigancho 3 etapa 97987",
                "(01) 3119000", "Azteca@banca.pe", "www.Azteca.pe", R.drawable.azteca, "El banco que necesitas"));

        empresas.add(new Empresa(5,"Hotel","Belmond","San Miguel 1213 - Lima",
                "(01) 2177000", "Belmond@hotel.com", "http://www.Belmond.com", R.drawable.beld, "Encuentre su mejor lugar de descanso"));

        empresas.add(new Empresa(6,"Hotel","CasaAndina","Santiago de Surco - Lima",
                "(01) 2061100", "CasaAndina@hotel.com", "http://www.CasaAndina.com", R.drawable.and, "El mejor lugar con el menor costo"));

        return empresas;
    }
}