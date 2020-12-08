package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1705")
public class Somador1705 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
