package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador859")
public class Somador859 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
