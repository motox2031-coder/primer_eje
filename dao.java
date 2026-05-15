public class dao {
}
package com.usuario.dao;

import com.usuario.model.Books;

import java.util.*;.Connection;
import java.sqlList;
import java.util.ArrayList; // Importa solo ArrayList

public class dao {
    conexion con = new conexion();

    try (Connection connection = con.getConnection()) {
        // Aquí puedes realizar operaciones con la conexión
    } catch (SQLException e) {
        e.printStackTrace();
        
    }
}