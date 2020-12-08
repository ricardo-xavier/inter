package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1827")
public class Somador1827 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
