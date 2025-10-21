/*
package com.example.onskeskyen.Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test {

    public void updateSubProjectCompletionStatus(int subProjectId) {
        // SQL forespørgsel for at hente "is_completed" for alle opgaver i delprojektet
        String selectQuery = "SELECT IsCompleted FROM Tasks WHERE subtaskid = ?";
        String updateQuery = "UPDATE subtasks SET iscompleted = ? WHERE subtaskid = ?";
        boolean allTasksCompleted = true;

        try (PreparedStatement selectPs = con.prepareStatement(selectQuery)) {
            selectPs.setInt(1, subProjectId);
            ResultSet rs = selectPs.executeQuery();

            // Gennemgå alle opgaver for at tjekke status
            while (rs.next()) {
                boolean isCompleted = rs.getBoolean("iscompleted");

                // Hvis en opgave ikke er færdig, sæt flaget til false og stop loopet
                if (!isCompleted) {
                    allTasksCompleted = false;
                    break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return; // Afslut metoden, hvis der opstår en fejl under læsning
        }

        // Opdater delprojektets status baseret på opgavernes status
        try (PreparedStatement updatePs = con.prepareStatement(updateQuery)) {
            updatePs.setBoolean(1, allTasksCompleted); // Sæt status til true eller false
            updatePs.setInt(2, subProjectId);
            updatePs.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
 */