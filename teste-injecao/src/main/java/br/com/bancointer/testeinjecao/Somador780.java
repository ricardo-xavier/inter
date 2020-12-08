package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador780")
public class Somador780 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
