package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1873")
public class Somador1873 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
