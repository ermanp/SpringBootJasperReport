package com.springreport.service;

import com.springreport.dao.UserDaoImpl;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.sql.SQLException;

@Service
public class UserService {

    @Autowired
    private UserDaoImpl userDao;

    public JasperPrint exportPdfFile() throws SQLException, JRException, IOException {
        return userDao.exportPdfFile();
    }
}
