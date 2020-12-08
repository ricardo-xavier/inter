package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador558")
public class Somador558 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
