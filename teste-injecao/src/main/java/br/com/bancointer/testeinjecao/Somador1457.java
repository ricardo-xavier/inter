package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1457")
public class Somador1457 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
