package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador668")
public class Somador668 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
