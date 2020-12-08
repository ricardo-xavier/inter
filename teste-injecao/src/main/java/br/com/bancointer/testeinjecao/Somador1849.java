package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1849")
public class Somador1849 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
