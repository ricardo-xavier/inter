package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador652")
public class Somador652 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
