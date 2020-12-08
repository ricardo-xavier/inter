package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador873")
public class Somador873 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
