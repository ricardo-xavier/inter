package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1558")
public class Somador1558 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
